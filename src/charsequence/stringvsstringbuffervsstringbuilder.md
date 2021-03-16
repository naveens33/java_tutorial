### String vs StringBuffer vs StringBuilder

* String is immutable whereas StringBuffer and StringBuider are mutable classes.
* StringBuffer is thread safe and synchronized whereas StringBuilder is not, thats why StringBuilder is more faster than StringBuffer.
* String concat + operator internally uses StringBuffer or StringBuilder class.
* For String manipulations in non-multi threaded environment, we should use StringBuilder else use StringBuffer class.

### thread safe vs thread unsafe

### synchronized vs asynchronized

### Is String is thread safe or not.