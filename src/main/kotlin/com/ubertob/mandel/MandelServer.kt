package com.ubertob.mandel

import org.http4k.servlet.HttpHandlerServlet
import javax.servlet.Servlet
import javax.servlet.annotation.WebServlet


@WebServlet("/")
open class RestServlet: Servlet by HttpHandlerServlet(
    MandelHandler())