/**
 *
 *  Copyright (c) 2016 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Thales - initial API and implementation
 */

package org.polarsys.kitalpha.vp.requirements.Requirements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.BooleanValueAttribute#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.vp.requirements.Requirements.RequirementsPackage#getBooleanValueAttribute()
 * @model
 * @generated
 */

public interface BooleanValueAttribute extends Attribute {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.polarsys.kitalpha.vp.requirements.Requirements.RequirementsPackage#getBooleanValueAttribute_Value()
	 * @model
	 * @generated
	 */

	boolean isValue();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.requirements.Requirements.BooleanValueAttribute#isValue <em>Value</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */

	void setValue(boolean value);

} // BooleanValueAttribute
