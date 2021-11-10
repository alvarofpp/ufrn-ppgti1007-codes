/**
 * generated by Xtext 2.25.0
 */
package org.ppgti.mydsl.myDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ppgti.mydsl.myDSL.MyDSLPackage
 * @generated
 */
public interface MyDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDSLFactory eINSTANCE = org.ppgti.mydsl.myDSL.impl.MyDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Pessoas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pessoas</em>'.
   * @generated
   */
  Pessoas createPessoas();

  /**
   * Returns a new object of class '<em>Pessoa</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pessoa</em>'.
   * @generated
   */
  Pessoa createPessoa();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDSLPackage getMyDSLPackage();

} //MyDSLFactory