/**
 * 
 */
package com.github.nnest.arcteryx;

/**
 * System
 * 
 * @author brad.wu
 */
public class System extends AbstractContainer implements ISystem {
	private ISystem derivation = null;

	public System(String id) {
		super(id);
	}

	public System(String id, ISystem derivation) {
		super(id);
		this.setDerivation(derivation);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.github.nnest.arcteryx.AbstractResource#getSystem()
	 */
	@Override
	public ISystem getSystem() {
		return this;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.github.nnest.arcteryx.ISystem#getDerivation()
	 */
	@Override
	public ISystem getDerivation() {
		return this.derivation;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.github.nnest.arcteryx.ISystem#setDerivation(com.github.nnest.arcteryx.ISystem)
	 */
	public void setDerivation(ISystem derivation) {
		this.derivation = derivation;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.github.nnest.arcteryx.AbstractContainer#accepted(com.github.nnest.arcteryx.IResource)
	 */
	@Override
	public boolean accepted(IResource resource) {
		if (resource instanceof IApplication) {
			return true;
		} else {
			this.getLogger().error("Resource[{}] must be an instance of {{}", resource.getId(), IApplication.class);
			return false;
		}
	}
}
