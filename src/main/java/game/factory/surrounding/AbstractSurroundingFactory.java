package game.factory.surrounding;


import game.environment.abstractObject.surrounding.obstacle.AbstractObstacle;
import game.environment.abstractObject.surrounding.platform.AbstractPlatform;
import game.environment.object.surrounding.obstacle.ObstacleType;
import game.environment.object.surrounding.platform.PlatformType;

abstract class AbstractSurroundingFactory {
    abstract AbstractObstacle getObstacle(ObstacleType type);
    abstract AbstractPlatform getPlatform(PlatformType type);
}
