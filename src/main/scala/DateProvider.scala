import java.time.LocalDate

trait DateProvider {
  def now: LocalDate
}

class RealDateProvider extends DateProvider {
  override def now: LocalDate = LocalDate.now
}