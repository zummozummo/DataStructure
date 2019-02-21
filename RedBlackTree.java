// strategy
// 1.insert Z and color it red
// 2.Recolor and rotate nodes to fix violation
//   4 scenarios
//   0. z==root                              just clolr it black
//   1. z.uncle=red
//            b(black)
//           /   \
//       A(r)    c(red)    ->uncle
//          \
//           z(red)
//
// in this situation recolor z's parent grandparent and uncle
//
//           b(red)
//           /   \
//     A(black)  c(black)    ->uncle
//           \
//           z(red)
// this is a subtree so b is red
//
//
//   2.z.uncle=black(triangle)
//                 b(b)
//               /     \
//     uncle   c(b)     a(r)
//                     /
//                   z(r)
// rotate z.parent right
//
//
//     3.z.uncle=black(line)
//
//                 right rotate
//               /   b(black)
//             /    /     \
//           /    c(red)    a(b) ->uncle
//         /      /   \
//             z(r)   d(b)
//
//     rotate z.grandparent to right & recolor
//
//               left rotate
//                 b(black)   \
//                 /     \     \
//             c(b)      a(r)   \
//                      /     \  \
//                   d(b)   z(r)  \
//     solution:rotate z.grandparent & recolor
//
//
//
//
//     TIME COMPLEXITY
// -------------------
//     Insert:  0(log n)
//     color red:0(1)
//     fix violations:
//       a)roclor O(1)
//       b)rotation O(1)
//     but we may need to do this up the tree so
//
//       analysing all above:
//        Total insertion time -O(logn)
---------------------------------------------------
// deletion O(log n)
// search   o(log n)
