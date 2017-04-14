package io.github.janezhango.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by xiaojing on 4/11/2017.
 */

@Mojo( name = "sayhi")
public class GreetingMojo extends AbstractMojo {
    @Parameter( property = "sayhi.greeting", defaultValue = "Hello World!" )
    private String greeting;

    public void execute() throws MojoExecutionException {
        getLog().info( "Greetings: " + greeting);
    }
}
