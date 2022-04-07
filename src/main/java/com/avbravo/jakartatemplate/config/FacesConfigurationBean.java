package com.avbravo.jakartatemplate.config;

import jakarta.faces.annotation.FacesConfig;
import static jakarta.faces.annotation.FacesConfig.Version.JSF_2_3;

/**
 *
 * @author hantsy
 */
@FacesConfig(
	// Activates CDI build-in beans
	version = JSF_2_3 
)
public class FacesConfigurationBean {

}
