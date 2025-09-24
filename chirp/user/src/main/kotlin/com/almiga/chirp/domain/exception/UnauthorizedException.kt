package com.almiga.chirp.domain.exception

import java.lang.RuntimeException

class UnauthorizedException: RuntimeException("Missing auth details")