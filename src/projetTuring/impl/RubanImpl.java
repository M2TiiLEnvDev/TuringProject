/**
 */
package projetTuring.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetTuring.Alphabet;
import projetTuring.ProjetTuringPackage;
import projetTuring.Ruban;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruban</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projetTuring.impl.RubanImpl#getList_symbole <em>List symbole</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RubanImpl extends MinimalEObjectImpl.Container implements Ruban {
	/**
	 * The cached value of the '{@link #getList_symbole() <em>List symbole</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList_symbole()
	 * @generated
	 * @ordered
	 */
	protected EList<Alphabet> list_symbole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RubanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTuringPackage.Literals.RUBAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alphabet> getList_symbole() {
		if (list_symbole == null) {
			list_symbole = new EObjectResolvingEList<Alphabet>(Alphabet.class, this, ProjetTuringPackage.RUBAN__LIST_SYMBOLE);
		}
		return list_symbole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjetTuringPackage.RUBAN__LIST_SYMBOLE:
				return getList_symbole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjetTuringPackage.RUBAN__LIST_SYMBOLE:
				getList_symbole().clear();
				getList_symbole().addAll((Collection<? extends Alphabet>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjetTuringPackage.RUBAN__LIST_SYMBOLE:
				getList_symbole().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjetTuringPackage.RUBAN__LIST_SYMBOLE:
				return list_symbole != null && !list_symbole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RubanImpl
