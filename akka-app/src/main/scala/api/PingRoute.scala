package api

import akka.http.scaladsl.server
import akka.http.scaladsl.server.Directives._

trait PingRoute {

  val route: server.Route = (get | options) {
    path("ping") {
      complete("OK")
    }
  }
}
