package com.dawn.json;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;

@Provider
public class JsonMoxyConfigurationContextResolver implements ContextResolver<MoxyJsonConfig> 
{
 
    private final MoxyJsonConfig config;
 
   public JsonMoxyConfigurationContextResolver() 
    {
        final Map<String, String> namespacePrefixMapper = new HashMap<String, String>();
        namespacePrefixMapper.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
 
        config = new MoxyJsonConfig()
                .setNamespacePrefixMapper(namespacePrefixMapper)
                .setNamespaceSeparator(':')
                .setAttributePrefix("")
                .setValueWrapper("value")
                .property(JAXBContextProperties.JSON_WRAPPER_AS_ARRAY_NAME, true)
                .setFormattedOutput(true)
                .setIncludeRoot(false)
                .setMarshalEmptyCollections(true);
    }
    
    /*public JsonMoxyConfigurationContextResolver() {
        config = new MoxyJsonConfig()
            .setIncludeRoot(true);
    }*/

	public MoxyJsonConfig getContext(Class<?> type) {
		// TODO Auto-generated method stub
		return config;
	}
 
   /* @Override
    public MoxyJsonConfig getContext(Class<?> objectType) 
    {
        return config;
    }*/
}
