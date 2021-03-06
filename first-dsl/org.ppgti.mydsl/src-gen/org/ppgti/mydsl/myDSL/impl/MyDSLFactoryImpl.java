/**
 * generated by Xtext 2.25.0
 */
package org.ppgti.mydsl.myDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ppgti.mydsl.myDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDSLFactoryImpl extends EFactoryImpl implements MyDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDSLFactory init()
  {
    try
    {
      MyDSLFactory theMyDSLFactory = (MyDSLFactory)EPackage.Registry.INSTANCE.getEFactory(MyDSLPackage.eNS_URI);
      if (theMyDSLFactory != null)
      {
        return theMyDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDSLPackage.PESSOAS: return createPessoas();
      case MyDSLPackage.PESSOA: return createPessoa();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pessoas createPessoas()
  {
    PessoasImpl pessoas = new PessoasImpl();
    return pessoas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pessoa createPessoa()
  {
    PessoaImpl pessoa = new PessoaImpl();
    return pessoa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDSLPackage getMyDSLPackage()
  {
    return (MyDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDSLPackage getPackage()
  {
    return MyDSLPackage.eINSTANCE;
  }

} //MyDSLFactoryImpl
