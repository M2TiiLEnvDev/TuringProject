/**
 */
package projetTuring;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projetTuring.ProjetTuringFactory
 * @model kind="package"
 * @generated
 */
public interface ProjetTuringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projetTuring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projetTuring";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projetTuring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetTuringPackage eINSTANCE = projetTuring.impl.ProjetTuringPackageImpl.init();

	/**
	 * The meta object id for the '{@link projetTuring.impl.AlphabetImpl <em>Alphabet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTuring.impl.AlphabetImpl
	 * @see projetTuring.impl.ProjetTuringPackageImpl#getAlphabet()
	 * @generated
	 */
	int ALPHABET = 0;

	/**
	 * The feature id for the '<em><b>Symboles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET__SYMBOLES = 0;

	/**
	 * The number of structural features of the '<em>Alphabet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alphabet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTuring.impl.SymboleImpl <em>Symbole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTuring.impl.SymboleImpl
	 * @see projetTuring.impl.ProjetTuringPackageImpl#getSymbole()
	 * @generated
	 */
	int SYMBOLE = 1;

	/**
	 * The number of structural features of the '<em>Symbole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Symbole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTuring.impl.RubanImpl <em>Ruban</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTuring.impl.RubanImpl
	 * @see projetTuring.impl.ProjetTuringPackageImpl#getRuban()
	 * @generated
	 */
	int RUBAN = 2;

	/**
	 * The feature id for the '<em><b>List symbole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBAN__LIST_SYMBOLE = 0;

	/**
	 * The number of structural features of the '<em>Ruban</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ruban</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBAN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link projetTuring.Alphabet <em>Alphabet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphabet</em>'.
	 * @see projetTuring.Alphabet
	 * @generated
	 */
	EClass getAlphabet();

	/**
	 * Returns the meta object for the containment reference list '{@link projetTuring.Alphabet#getSymboles <em>Symboles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symboles</em>'.
	 * @see projetTuring.Alphabet#getSymboles()
	 * @see #getAlphabet()
	 * @generated
	 */
	EReference getAlphabet_Symboles();

	/**
	 * Returns the meta object for class '{@link projetTuring.Symbole <em>Symbole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbole</em>'.
	 * @see projetTuring.Symbole
	 * @generated
	 */
	EClass getSymbole();

	/**
	 * Returns the meta object for class '{@link projetTuring.Ruban <em>Ruban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruban</em>'.
	 * @see projetTuring.Ruban
	 * @generated
	 */
	EClass getRuban();

	/**
	 * Returns the meta object for the reference list '{@link projetTuring.Ruban#getList_symbole <em>List symbole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List symbole</em>'.
	 * @see projetTuring.Ruban#getList_symbole()
	 * @see #getRuban()
	 * @generated
	 */
	EReference getRuban_List_symbole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjetTuringFactory getProjetTuringFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projetTuring.impl.AlphabetImpl <em>Alphabet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTuring.impl.AlphabetImpl
		 * @see projetTuring.impl.ProjetTuringPackageImpl#getAlphabet()
		 * @generated
		 */
		EClass ALPHABET = eINSTANCE.getAlphabet();

		/**
		 * The meta object literal for the '<em><b>Symboles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHABET__SYMBOLES = eINSTANCE.getAlphabet_Symboles();

		/**
		 * The meta object literal for the '{@link projetTuring.impl.SymboleImpl <em>Symbole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTuring.impl.SymboleImpl
		 * @see projetTuring.impl.ProjetTuringPackageImpl#getSymbole()
		 * @generated
		 */
		EClass SYMBOLE = eINSTANCE.getSymbole();

		/**
		 * The meta object literal for the '{@link projetTuring.impl.RubanImpl <em>Ruban</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTuring.impl.RubanImpl
		 * @see projetTuring.impl.ProjetTuringPackageImpl#getRuban()
		 * @generated
		 */
		EClass RUBAN = eINSTANCE.getRuban();

		/**
		 * The meta object literal for the '<em><b>List symbole</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUBAN__LIST_SYMBOLE = eINSTANCE.getRuban_List_symbole();

	}

} //ProjetTuringPackage
