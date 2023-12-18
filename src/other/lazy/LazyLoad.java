/*--- (C) 1999-2023 Techniker Krankenkasse ---*/

package other.lazy;

import java.util.function.Supplier;

public class LazyLoad<T> {

	private final Supplier<T> supplier;
	boolean isLoaded = false;
	T value;

	public LazyLoad(Supplier<T> supplier) {
		this.supplier = supplier;
	}

	public T getValue() {
		if (!isLoaded) {
			value = supplier.get();
			isLoaded = true;
		}

		return value;
	}
}

/*--- Formatiert nach TK Code Konventionen vom 05.03.2002 ---*/
