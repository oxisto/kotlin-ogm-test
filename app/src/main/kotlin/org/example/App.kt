/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import org.example.graph.declarations.FunctionDeclaration
import org.example.graph.edges.AstEdge
import org.example.graph.statements.Block
import org.neo4j.ogm.config.Configuration
import org.neo4j.ogm.session.SessionFactory

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    var func = FunctionDeclaration()
    func.bodyEdge = AstEdge(func, Block())

    println("Connecting to Neo4J...")

    val configuration =
        Configuration.Builder()
            .uri("bolt://localhost:7687")
            .credentials("neo4j", "password")
            .verifyConnection(true)
            .build()
    val sessionFactory = SessionFactory(configuration, "org.example.graph")

    val session = sessionFactory.openSession()

    session.save(func)

    println(App().greeting)
}
