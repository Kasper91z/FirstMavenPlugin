package com.epam.java.academy.FirstMavenPlugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "sayinstallbabe")
public class Babe extends AbstractMojo
{
	public void execute() {
		getLog().info("InstallBabe");
	}
}
