package com.dawn.json;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import com.dawn.json.action.StudentResource;

@ApplicationPath("rest/*")
public class CustomApplication extends Application
{
    //Add Service APIs
    @Override
    public Set<Class<?>> getClasses() 
    {
        Set<Class<?>> resources = new HashSet<Class<?>>();
 
        System.out.println("################ Application - getclasses");
        
        //register REST modules
        resources.add(StudentResource.class);
 
        //Manually adding MOXyJSONFeature
        resources.add(org.glassfish.jersey.moxy.json.MoxyJsonFeature.class);
        resources.add(org.glassfish.jersey.moxy.xml.MoxyXmlFeature.class);
 
        //Configure Moxy behavior
        resources.add(JsonMoxyConfigurationContextResolver.class);
 
        System.out.println("################ Application - getclasses");
        
        return resources;
    }
    
    @Override
    public Set<Object> getSingletons() {
        MOXyJsonProvider moxyJsonProvider = new MOXyJsonProvider();
        moxyJsonProvider.setIncludeRoot(true);

        HashSet<Object> set = new HashSet<Object>(1);
        set.add(moxyJsonProvider);
        return set;
    }
}
