/**
 */
package projetTuring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alphabet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projetTuring.Alphabet#getSymboles <em>Symboles</em>}</li>
 * </ul>
 * </p>
 *
 * @see projetTuring.ProjetTuringPackage#getAlphabet()
 * @model
 * @generated
 */
public interface Alphabet extends EObject {
	/**
	 * Returns the value of the '<em><b>Symboles</b></em>' containment reference list.
	 * The list contents are of type {@link projetTuring.Symbole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symboles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symboles</em>' containment reference list.
	 * @see projetTuring.ProjetTuringPackage#getAlphabet_Symboles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symbole> getSymboles();

} // Alphabet
