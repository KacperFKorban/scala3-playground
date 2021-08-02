package helpers

class XDClass:
  def xd: Int = ???

def helpWithStuff(xd: XDClass): String = {
  List(1,2,3).map(_.toString).mkString
}
