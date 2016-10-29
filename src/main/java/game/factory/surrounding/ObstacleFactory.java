package game.factory.surrounding;

import game.environment.surrounding.obstacle.AbstractObstacle;
import game.environment.surrounding.obstacle.ObstacleType;
import game.environment.surrounding.platform.AbstractPlatform;
import game.environment.surrounding.platform.PlatformType;

import static game.environment.enemy.EnemyType.ZOMBIE;

/**
 * Created by kalafioras on 2016-10-29.
 */
public class ObstacleFactory {
     AbstractObstacle getObstacle(ObstacleType obstacleType)
     {
         switch (obstacleType){
             case SPIKE:
                 System.out.println("spike");
                 break;
             case FENCE:
                 System.out.println("fence");
             case ROCK:
                 System.out.println("rock");
                 break;
         }
         return null;
     }

     AbstractPlatform getPlatform(PlatformType type)
     {
         return null;
     }
}
