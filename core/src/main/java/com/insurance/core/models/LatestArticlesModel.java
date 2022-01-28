package com.insurance.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

@Model(adaptables = {SlingHttpServletRequest.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LatestArticlesModel {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@ValueMapValue
	private String parentpath;
		
	@ScriptVariable
	private ResourceResolver resolver;
	
	@PostConstruct
	public void init() {
		Resource resource = resolver.getResource("");
		ValueMap properties = resource.getValueMap();
		properties.get("property-name", "default-value");
		Node node = resource.adaptTo(Node.class);
		node.get
	}

}
