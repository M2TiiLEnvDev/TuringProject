/**
 */
package projetTuring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see projetTuring.ProjetTuringPackage
 * @generated
 */
public interface ProjetTuringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetTuringFactory eINSTANCE = projetTuring.impl.ProjetTuringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alphabet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alphabet</em>'.
	 * @generated
	 */
	Alphabet createAlphabet();

	/**
	 * Returns a new object of class '<em>Symbole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbole</em>'.
	 * @generated
	 */
	Symbole createSymbole();

	/**
	 * Returns a new object of class '<em>Ruban</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruban</em>'.
	 * @generated
	 */
	Ruban createRuban();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjetTuringPackage getProjetTuringPackage();

} //ProjetTuringFactory
