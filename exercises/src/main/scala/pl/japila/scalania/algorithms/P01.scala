package pl.japila.scalania.algorithms

object P01 {
  val solutions = Seq[(Site, Site, Seq[Link]) => Boolean](
    isConnected
  )

  implicit class Site(val n: Int) extends AnyVal

  case class Link(s1: Site, s2: Site)

  /**
   * Checks whether two sites belong to the same component which is a group of connected sites
   *
   * @return true when sites are connected; false otherwise
   */
  def isConnected = (s1: Site, s2: Site, ls: Seq[Link]) => ???
}
