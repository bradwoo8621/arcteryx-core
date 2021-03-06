/**
 * 
 */
package com.github.nnest.arcteryx;

import com.github.nnest.arcteryx.event.IResourceEventListener;
import com.github.nnest.arcteryx.event.IResourceLifecycleEventListener;

/**
 * Resource. <br/>
 * Everything is a resource.
 * 
 * @author brad.wu
 */
public interface IResource {
	String SEPARATOR = "/";
	char SEPARATOR_CHAR = '/';

	/**
	 * get identity
	 * 
	 * @return
	 */
	String getId();

	/**
	 * get path
	 * 
	 * @return
	 */
	String getPath();

	/**
	 * get container
	 * 
	 * @return
	 */
	IContainer getContainer();

	/**
	 * set container
	 * 
	 * @param container
	 */
	void setContainer(IContainer container);

	/**
	 * get system of resource
	 * 
	 * @return
	 */
	ISystem getSystem();

	/**
	 * set system of resource
	 * 
	 * @param system
	 */
	void setSystem(ISystem system);

	/**
	 * destroy self
	 */
	void destroy();

	/**
	 * add lifecycle listener
	 * 
	 * @param listener
	 */
	void addLifecycleListener(IResourceLifecycleEventListener listener);

	/**
	 * remove lifecycle listener
	 * 
	 * @param listener
	 * @return true when remove successfully
	 */
	boolean removeLifecycleListener(IResourceLifecycleEventListener listener);

	/**
	 * add listener
	 * 
	 * @param listener
	 * @param listenerClass
	 */
	<T extends IResourceEventListener> boolean removeListener(T listener, Class<T> listenerClass);

	/**
	 * remove listener
	 * 
	 * @param listener
	 * @param listenerClass
	 * @return
	 */
	<T extends IResourceEventListener> void addListener(T listener, Class<T> listenerClass);
}
