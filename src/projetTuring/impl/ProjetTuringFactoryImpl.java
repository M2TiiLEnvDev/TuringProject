/**
 */
package projetTuring.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projetTuring.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetTuringFactoryImpl extends EFactoryImpl implements ProjetTuringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjetTuringFactory init() {
		try {
			ProjetTuringFactory theProjetTuringFactory = (ProjetTuringFactory)EPackage.Registry.INSTANCE.getEFactory(ProjetTuringPackage.eNS_URI);
			if (theProjetTuringFactory != null) {
				return theProjetTuringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjetTuringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTuringFactoryImpl() {
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
			case ProjetTuringPackage.ALPHABET: return createAlphabet();
			case ProjetTuringPackage.SYMBOLE: return createSymbole();
			case ProjetTuringPackage.RUBAN: return createRuban();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alphabet createAlphabet() {
		AlphabetImpl alphabet = new AlphabetImpl();
		return alphabet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbole createSymbole() {
		SymboleImpl symbole = new SymboleImpl();
		return symbole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruban createRuban() {
		RubanImpl ruban = new RubanImpl();
		return ruban;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTuringPackage getProjetTuringPackage() {
		return (ProjetTuringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjetTuringPackage getPackage() {
		return ProjetTuringPackage.eINSTANCE;
	}

} //ProjetTuringFactoryImpl
