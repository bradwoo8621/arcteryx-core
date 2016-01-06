/**
 * 
 */
package com.github.nnest.arcteryx;

import java.util.Collection;

/**
 * Enterprise
 * 
 * @author brad.wu
 */
public interface IEnterprise {
	/**
	 * get applications
	 * 
	 * @return
	 */
	Collection<IApplication> getApplications();

	/**
	 * get all started applications
	 * 
	 * @return
	 */
	Collection<IApplication> getStartedApplications();

	/**
	 * get application by give id
	 * 
	 * @param applicationId
	 * @return
	 */
	IApplication getApplication(String applicationId);

	/**
	 * prepare application, not startup
	 * 
	 * @param application
	 * @return
	 */
	void prepareApplication(IApplication application);

	/**
	 * startup enterprise
	 * 
	 * @return
	 */
	void startup();

	/**
	 * startup application, application should be appended into enterprise
	 * 
	 * @param applicationId
	 * @return
	 */
	void startupApplication(String applicationId);

	/**
	 * startup application. if the same application existed, shutdown the old
	 * one
	 * 
	 * @param application
	 * @return
	 */
	void startupApplication(IApplication application);

	/**
	 * check the status of application by given application id
	 * 
	 * @param applicationId
	 * @return
	 */
	boolean isApplicationStartup(String applicationId);

	/**
	 * shutdown enterprise
	 * 
	 * @return
	 */
	void shutdown();

	/**
	 * shutdown application
	 * 
	 * @param applicationId
	 * @return
	 */
	void shutdownApplication(String applicationId);
}