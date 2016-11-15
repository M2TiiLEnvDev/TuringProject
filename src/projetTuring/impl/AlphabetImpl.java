/**
 */
package projetTuring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projetTuring.Alphabet;
import projetTuring.ProjetTuringPackage;
import projetTuring.Symbole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alphabet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projetTuring.impl.AlphabetImpl#getSymboles <em>Symboles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlphabetImpl extends MinimalEObjectImpl.Container implements Alphabet {
	/**
	 * The cached value of the '{@link #getSymboles() <em>Symboles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymboles()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbole> symboles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphabetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTuringPackage.Literals.ALPHABET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbole> getSymboles() {
		if (symboles == null) {
			symboles = new EObjectContainmentEList<Symbole>(Symbole.class, this, ProjetTuringPackage.ALPHABET__SYMBOLES);
		}
		return symboles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjetTuringPackage.ALPHABET__SYMBOLES:
				return ((InternalEList<?>)getSymboles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjetTuringPackage.ALPHABET__SYMBOLES:
				return getSymboles();
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
			case ProjetTuringPackage.ALPHABET__SYMBOLES:
				getSymboles().clear();
				getSymboles().addAll((Collection<? extends Symbole>)newValue);
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
			case ProjetTuringPackage.ALPHABET__SYMBOLES:
				getSymboles().clear();
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
			case ProjetTuringPackage.ALPHABET__SYMBOLES:
				return symboles != null && !symboles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlphabetImpl
