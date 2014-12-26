package cn.com.xdays.sys.filter;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.octo.captcha.service.CaptchaService;
import com.octo.captcha.service.CaptchaServiceException;

/**
 * 后台Action类 - 生成验证码类
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

@Component("jCaptchaFilter")
public class JCaptchaFilter implements Filter {

	@Resource
	private CaptchaService captchaService;

	/**
	 * 初始化过滤器
	 */
	public void init(FilterConfig fConfig) throws ServletException {}

	/**
	 * 销毁过滤器
	 */
	public void destroy() {}

	/**
	 * 执行过滤器：有访问“/captcha.jpg”请求的时候生成验证码
	 */
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		try {
			String captchaId = request.getSession(true).getId();
			BufferedImage challenge = (BufferedImage) captchaService.getChallengeForID(captchaId, request.getLocale());
			ImageIO.write(challenge, "jpg", out);
			out.flush();
		} catch (CaptchaServiceException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}

}
