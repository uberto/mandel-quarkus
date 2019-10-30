package com.ubertob.mandel

import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK

class MandelHandler : (Request) -> Response {
    override fun invoke(request: Request): Response {
        return Response(OK).body("<html><body><h1>Hello</h1></body></html>")
    }

}
