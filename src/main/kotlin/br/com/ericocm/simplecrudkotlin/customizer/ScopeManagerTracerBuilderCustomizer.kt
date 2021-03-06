package br.com.ericocm.simplecrudkotlin.customizer

import io.jaegertracing.internal.JaegerTracer
import io.opentracing.contrib.java.spring.jaeger.starter.TracerBuilderCustomizer
import br.com.ericocm.simplecrudkotlin.util.DiagnosticContextScopeManager

class ScopeManagerTracerBuilderCustomizer : TracerBuilderCustomizer {

    override fun customize(builder: JaegerTracer.Builder) {
        builder.withScopeManager(DiagnosticContextScopeManager())
    }
}