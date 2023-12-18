/*--- (C) 1999-2023 Techniker Krankenkasse ---*/

package other.unitOfWork;

public interface IUnitOfWork<T> {

	void registerNew(T entity);

	void registerModified(T entity);

	void registerDeleted(T entity);

	void commit();
}

/*--- Formatiert nach TK Code Konventionen vom 05.03.2002 ---*/
