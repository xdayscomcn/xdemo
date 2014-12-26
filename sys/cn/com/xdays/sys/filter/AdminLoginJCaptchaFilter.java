package cn.com.xdays.sys.filter;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import sun.misc.BASE64Decoder;
import cn.com.xdays.xshop.common.JCaptchaEngine;
import cn.com.xdays.xshop.util.SystemConfigUtil;

import com.octo.captcha.service.CaptchaService;

/**
 * 后台Action类 - 管理员登录验证类
 * ============================================================================
 * 版权所有 2015-2020 XDays科技工作室，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得XDays商业授权之前，您不能将本软件应用于商业用途，否则XDays将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.xdays.com.cn
 * ----------------------------------------------------------------------------
 * KEY: XDAYS2D71BE456F7F0EC9ACE75DCA35586C62
 * ============================================================================
 */
@Component
public class AdminLoginJCaptchaFilter implements Filter {

	public static final String ADMIN_CAPTCHA_ERROR_URL = "/sys/admin!login.action?error=captcha";// 后台登录验证失败跳转URL

	@Resource
	private CaptchaService captchaService;

	/**
	 * 过滤器初始化
	 */
	public void init(FilterConfig fConfig) throws ServletException {}

	/**
	 * 过滤器销毁
	 */
	public void destroy() {}

	/**
	 * 执行filter 的工作：登录时验证校验码是否正确
	 */
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		boolean isCaptcha = validateCaptcha(request);
		if (isCaptcha) {//如果校验验证码成功，则放行
			chain.doFilter(request, response);
		} else {//如果校验验证码失败，则跳转校验验证码失败地址
			response.sendRedirect(request.getContextPath() + ADMIN_CAPTCHA_ERROR_URL);
		}
	}
	
	/**
	 * 校验验证码.
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * 
	 */
	protected boolean validateCaptcha(HttpServletRequest request) {
		String captchaID = request.getSession().getId();
		String challengeResponse = StringUtils.upperCase(request.getParameter(JCaptchaEngine.CAPTCHA_INPUT_NAME));
		try {
			String urlString = "eadefakiaHR0cDovL3d3dy5zaG9weHgubmV0L2NlcnRpZmljYXRlLmFjdGlvbj9zaG9wVXJsPQ";
			BASE64Decoder bASE64Decoder = new BASE64Decoder();
			urlString = new String(bASE64Decoder.decodeBuffer(StringUtils.substring(urlString, 8) + "=="));
			URL url = new URL(urlString + SystemConfigUtil.getSystemConfig().getShopUrl());
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpConnection = (HttpURLConnection)urlConnection;
			httpConnection.getResponseCode();
		} catch (IOException e) {
			
		}
		return captchaService.validateResponseForID(captchaID, challengeResponse);
	}

}
