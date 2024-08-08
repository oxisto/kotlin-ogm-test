package org.example.graph.declarations

import org.example.graph.Node
import org.example.graph.edges.AstEdge
import org.example.graph.statements.Block
import org.example.graph.statements.Statement
import org.neo4j.ogm.annotation.Relationship

class FunctionDeclaration : Node() {

    @Relationship(value = "BODY")
    var bodyEdge: AstEdge<Statement> = AstEdge(this, Block())

}