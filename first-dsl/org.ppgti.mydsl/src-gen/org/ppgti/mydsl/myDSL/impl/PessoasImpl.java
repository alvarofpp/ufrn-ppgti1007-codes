/**
 * generated by Xtext 2.25.0
 */
package org.ppgti.mydsl.myDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ppgti.mydsl.myDSL.MyDSLPackage;
import org.ppgti.mydsl.myDSL.Pessoa;
import org.ppgti.mydsl.myDSL.Pessoas;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pessoas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ppgti.mydsl.myDSL.impl.PessoasImpl#getBaseDados <em>Base Dados</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PessoasImpl extends MinimalEObjectImpl.Container implements Pessoas
{
  /**
   * The cached value of the '{@link #getBaseDados() <em>Base Dados</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseDados()
   * @generated
   * @ordered
   */
  protected EList<Pessoa> baseDados;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PessoasImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDSLPackage.Literals.PESSOAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Pessoa> getBaseDados()
  {
    if (baseDados == null)
    {
      baseDados = new EObjectContainmentEList<Pessoa>(Pessoa.class, this, MyDSLPackage.PESSOAS__BASE_DADOS);
    }
    return baseDados;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDSLPackage.PESSOAS__BASE_DADOS:
        return ((InternalEList<?>)getBaseDados()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDSLPackage.PESSOAS__BASE_DADOS:
        return getBaseDados();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDSLPackage.PESSOAS__BASE_DADOS:
        getBaseDados().clear();
        getBaseDados().addAll((Collection<? extends Pessoa>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDSLPackage.PESSOAS__BASE_DADOS:
        getBaseDados().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDSLPackage.PESSOAS__BASE_DADOS:
        return baseDados != null && !baseDados.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PessoasImpl
