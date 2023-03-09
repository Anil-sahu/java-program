main() {
  String str = "This is simple list my coding";
  List strList = str.split(" ");
  int count = 0;
  var result = "";
  for (int i = 0; i < str.length; i++) {
    if (str[i] == 'i') {
      count++;
    }
    if (count == 3 && str[i] == 'i') {
      result += "AA";
    } else {
      result += str[i];
    }
    ;
  }
  strList.sort((a, b) {
  return  a.length.compareTo(b.length);
  },);
  print(strList);
}
