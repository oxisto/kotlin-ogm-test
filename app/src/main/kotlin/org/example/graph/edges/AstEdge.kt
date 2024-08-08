package org.example.graph.edges

import org.example.graph.Node
import org.neo4j.ogm.annotation.EndNode
import org.neo4j.ogm.annotation.RelationshipEntity
import org.neo4j.ogm.annotation.StartNode

@RelationshipEntity
class AstEdge<T : Node>(@StartNode var start: Node, @EndNode var end: T) : Edge<T>() {

}