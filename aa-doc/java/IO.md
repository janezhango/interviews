# Stream VS Reader
An InputStream is the raw method of getting information from a resource. It grabs the data byte by byte without performing any kind of translation. If you are reading image data, or any binary file, this is the stream to use.

A Reader is designed for character streams. If the information you are reading is all text, then the Reader will take care of the character decoding for you and give you unicode characters from the raw input stream. If you are reading any type of text, this is the stream to use.

You can wrap an InputStream and turn it into a Reader by using the InputStreamReader class.

Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);