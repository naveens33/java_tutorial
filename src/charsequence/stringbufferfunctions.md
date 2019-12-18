### StringBuffer Functions

|Modifier and Type|	Method|	Description|
|-----------------|-------|------------|
|public synchronized StringBuffer|	append(String s)|	is used to append the specified string with this string. The append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc.|
|public synchronized StringBuffer|	insert(int offset, String s)|	is used to insert the specified string with this string at the specified position. The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.|
|public synchronized StringBuffer|	replace(int startIndex, int endIndex, String str)|	is used to replace the string from specified startIndex and endIndex.|
|public synchronized StringBuffer|	delete(int startIndex, int endIndex)|	is used to delete the string from specified startIndex and endIndex.|
|public synchronized StringBuffer|	reverse()|	is used to reverse the string.|
|public int|	capacity()|	is used to return the current capacity.|
|public void|	ensureCapacity(int minimumCapacity)|	is used to ensure the capacity at least equal to the given minimum.|
|public char|	charAt(int index)|	is used to return the character at the specified position.|
|public int|	length()|	is used to return the length of the string i.e. total number of characters.|
|public String|	substring(int beginIndex)|	is used to return the substring from the specified beginIndex.|
|public String|	substring(int beginIndex, int endIndex)|	is used to return the substring from the specified beginIndex and endIndex.|