/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manipulate Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.ManipulateStatement#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getManipulateStatement()
 * @model
 * @generated
 */
public interface ManipulateStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(TableDeclaration)
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getManipulateStatement_Table()
   * @model
   * @generated
   */
  TableDeclaration getTable();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group19.easySql.easySql.ManipulateStatement#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDeclaration value);

} // ManipulateStatement
