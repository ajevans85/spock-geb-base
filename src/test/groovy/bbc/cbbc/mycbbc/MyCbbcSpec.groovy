package bbc.cbbc.mycbbc

import geb.spock.GebReportingSpec

class MyCbbcSpec extends GebReportingSpec {

  def "visit the mycbbc page"() {
    when:
      go "http://www.bbc.co.uk/cbbc/mycbbc"

    then:
      $('title').text() == "BBC - CBBC - My CBBC"
  }
}
