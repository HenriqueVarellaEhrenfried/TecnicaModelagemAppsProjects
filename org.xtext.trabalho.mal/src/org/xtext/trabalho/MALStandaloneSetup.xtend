/*
 * generated by Xtext 2.12.0
 */
package org.xtext.trabalho


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MALStandaloneSetup extends MALStandaloneSetupGenerated {

	def static void doSetup() {
		new MALStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
