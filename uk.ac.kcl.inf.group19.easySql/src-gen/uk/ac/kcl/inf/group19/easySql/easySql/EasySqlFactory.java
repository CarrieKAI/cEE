/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage
 * @generated
 */
public interface EasySqlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EasySqlFactory eINSTANCE = uk.ac.kcl.inf.group19.easySql.easySql.impl.EasySqlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Sql Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sql Program</em>'.
   * @generated
   */
  SqlProgram createSqlProgram();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Query Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Statement</em>'.
   * @generated
   */
  QueryStatement createQueryStatement();

  /**
   * Returns a new object of class '<em>Manipulate Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Manipulate Statement</em>'.
   * @generated
   */
  ManipulateStatement createManipulateStatement();

  /**
   * Returns a new object of class '<em>Multi Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Type</em>'.
   * @generated
   */
  MultiType createMultiType();

  /**
   * Returns a new object of class '<em>Num Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Num Literal</em>'.
   * @generated
   */
  NumLiteral createNumLiteral();

  /**
   * Returns a new object of class '<em>Str Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Str Literal</em>'.
   * @generated
   */
  StrLiteral createStrLiteral();

  /**
   * Returns a new object of class '<em>Rin Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rin Literal</em>'.
   * @generated
   */
  RinLiteral createRinLiteral();

  /**
   * Returns a new object of class '<em>Table Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Declaration</em>'.
   * @generated
   */
  TableDeclaration createTableDeclaration();

  /**
   * Returns a new object of class '<em>Single Select Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Select Declaration</em>'.
   * @generated
   */
  SingleSelectDeclaration createSingleSelectDeclaration();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Equation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equation</em>'.
   * @generated
   */
  Equation createEquation();

  /**
   * Returns a new object of class '<em>Vvalue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vvalue</em>'.
   * @generated
   */
  Vvalue createVvalue();

  /**
   * Returns a new object of class '<em>Multi Equation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Equation</em>'.
   * @generated
   */
  MultiEquation createMultiEquation();

  /**
   * Returns a new object of class '<em>Insert</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert</em>'.
   * @generated
   */
  Insert createInsert();

  /**
   * Returns a new object of class '<em>Update</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update</em>'.
   * @generated
   */
  Update createUpdate();

  /**
   * Returns a new object of class '<em>Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete</em>'.
   * @generated
   */
  Delete createDelete();

  /**
   * Returns a new object of class '<em>Simple Select Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Select Query</em>'.
   * @generated
   */
  SimpleSelectQuery createSimpleSelectQuery();

  /**
   * Returns a new object of class '<em>Join Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Query</em>'.
   * @generated
   */
  JoinQuery createJoinQuery();

  /**
   * Returns a new object of class '<em>Nested Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Query</em>'.
   * @generated
   */
  NestedQuery createNestedQuery();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EasySqlPackage getEasySqlPackage();

} //EasySqlFactory
