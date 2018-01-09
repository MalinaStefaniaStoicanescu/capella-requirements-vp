/**
 *
 *  Copyright (c) 2016, 2017 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Thales - initial API and implementation
 */

package org.polarsys.capella.vp.requirements.CapellaRequirements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.vp.requirements.CapellaRequirements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapellaRequirementsFactoryImpl extends EFactoryImpl implements CapellaRequirementsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2016, 2017 THALES GLOBAL SERVICES.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n\r\n Contributors:\r\n    Thales - initial API and implementation"; //$NON-NLS-1$

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapellaRequirementsFactory init() {
		try {
			CapellaRequirementsFactory theCapellaRequirementsFactory = (CapellaRequirementsFactory) EPackage.Registry.INSTANCE
					.getEFactory(CapellaRequirementsPackage.eNS_URI);
			if (theCapellaRequirementsFactory != null) {
				return theCapellaRequirementsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapellaRequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaRequirementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CapellaRequirementsPackage.CAPELLA_TYPES_FOLDER:
			return (EObject) createCapellaTypesFolder();
		case CapellaRequirementsPackage.CAPELLA_MODULE:
			return (EObject) createCapellaModule();
		case CapellaRequirementsPackage.CAPELLA_INCOMING_RELATION:
			return (EObject) createCapellaIncomingRelation();
		case CapellaRequirementsPackage.CAPELLA_OUTGOING_RELATION:
			return (EObject) createCapellaOutgoingRelation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaTypesFolder createCapellaTypesFolder() {
		CapellaTypesFolderImpl capellaTypesFolder = new CapellaTypesFolderImpl();
		return capellaTypesFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaModule createCapellaModule() {
		CapellaModuleImpl capellaModule = new CapellaModuleImpl();
		return capellaModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaIncomingRelation createCapellaIncomingRelation() {
		CapellaIncomingRelationImpl capellaIncomingRelation = new CapellaIncomingRelationImpl();
		return capellaIncomingRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaOutgoingRelation createCapellaOutgoingRelation() {
		CapellaOutgoingRelationImpl capellaOutgoingRelation = new CapellaOutgoingRelationImpl();
		return capellaOutgoingRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaRequirementsPackage getCapellaRequirementsPackage() {
		return (CapellaRequirementsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapellaRequirementsPackage getPackage() {
		return CapellaRequirementsPackage.eINSTANCE;
	}

} //CapellaRequirementsFactoryImpl