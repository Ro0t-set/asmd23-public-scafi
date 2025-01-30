package lab.demo

import lab.demo.Incarnation.Builtins

class Main extends AggregateProgramSkeleton:
  override def main() = rep((Double.MaxValue, 0)):
    import Builtins.Bounded.*
    d => mux(sense1){ (0.0, 0) }{ minHoodPlus( (nbr{d}._1+nbrRange, nbr{mid} ) ) }

object Demo extends Simulation[Main]

