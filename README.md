# file-utils
A sample project to read &amp; write files in XML. This project can extended to support other file formats like csv, json etc.

### Usage:

* To `read` a xml file:
```java
final String file = <file_to_read>;
final String fileFormat = "xml";
final Parser xmlParser = ParserFactory.getParser(fileFormat);

final Employees employees = xmlParser.parse(file, <Object_Type_To_Read>);
``` 

* To `write` a xml file:
```java
final String file = <file_to_write>;
final String fileFormat = "xml";
final Writer writer = WriterFactory.getWriter(fileFormat);

writer.write(<Object_To_Write>, <Object_Type_Write>, file);
```
### Note:
Refer to the `Application` class for example usage. 