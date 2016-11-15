/**
 */
package projetTuring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruban</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projetTuring.Ruban#getList_symbole <em>List symbole</em>}</li>
 * </ul>
 * </p>
 *
 * @see projetTuring.ProjetTuringPackage#getRuban()
 * @model
 * @generated
 */
public interface Ruban extends EObject {
	/**
	 * Returns the value of the '<em><b>List symbole</b></em>' reference list.
	 * The list contents are of type {@link projetTuring.Alphabet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List symbole</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List symbole</em>' reference list.
	 * @see projetTuring.ProjetTuringPackage#getRuban_List_symbole()
	 * @model
	 * @generated
	 */
	EList<Alphabet> getList_symbole();

} // Ruban
