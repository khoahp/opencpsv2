package org.opencps.serviceinfo.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author khoavu
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=opencps.fontend",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=serviceinfo-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ServiceinfoWebPortlet extends MVCPortlet {
}