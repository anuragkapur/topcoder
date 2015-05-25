/**
 * Max points: 500
 * Status: Complete
 */
public class PublicTransit {
	
	public int minimumLongestDistance(int R, int C) {

        int minLongestDistance = Integer.MAX_VALUE;

        // initialise points
        Point points[] = new Point[R*C];
        int count = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                points[count] = new Point();
                points[count].r = i;
                points[count].c = j;
                count ++;
            }
        }

        // for each possible placement of teleporters
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                Point teleporters[] = new Point[2];
                teleporters[0] = new Point();
                teleporters[0].r = i;
                teleporters[0].c = i;
                for (int k = 0; k < R; k++) {
                    for (int l = 0; l < C; l++) {
                        teleporters[1] = new Point();
                        teleporters[1].r = k;
                        teleporters[1].c = l;

                        // compute max distance for all point pairs
                        int distance = Integer.MIN_VALUE;
                        for (Point point : points) {
                            for (Point otherPoint : points) {
                                distance = Math.max(distance, minDistanceBetweenPoints(point, otherPoint, teleporters));
                            }
                        }

                        minLongestDistance = Math.min(minLongestDistance, distance);
                    }
                }
            }
        }

		return minLongestDistance;
	}

    private int minDistanceBetweenPoints(Point point, Point otherPoint, Point teleporters[]) {

        int distance = Integer.MAX_VALUE;

        // direct distance
        distance = Math.min(distance, Math.abs(point.r - otherPoint.r) + Math.abs(point.c - otherPoint.c));

        // via teleporter[0];
        distance = Math.min(distance,
                    Math.abs(point.r - teleporters[0].r) + Math.abs(point.c - teleporters[0].c) +
                    Math.abs(teleporters[1].r - otherPoint.r) + Math.abs(teleporters[1].c - otherPoint.c)
                    );

        // via teleporter[1];
        distance = Math.min(distance,
                    Math.abs(point.r - teleporters[1].r) + Math.abs(point.c - teleporters[1].c) +
                    Math.abs(teleporters[0].r - otherPoint.r) + Math.abs(teleporters[0].c - otherPoint.c)
                    );

        return distance;
    }

    private class Point {
        int r;
        int c;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (r != point.r) return false;
            return c == point.c;

        }

        @Override
        public int hashCode() {
            int result = r;
            result = 31 * result + c;
            return result;
        }
    }
}