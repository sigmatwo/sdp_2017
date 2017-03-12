def isTriggered(p : Double) : Stream[Boolean] = (math.random < p) # :: isTriggered(p)

isTriggered(0.05) take 100 foreach println