var readlineSync = require('readline-sync');
var player1 = 'feri';
var item = '';
function start (player) {
  var ways = ['jobb', 'bal'];
  var way = readlineSync.keyInSelect(ways, 'jobb vagy bal jaratot választod');
  console.log(way);

  if (way === 0) {
    right(player);
  }
  if (way === 1) {
    left(player);
  }
}

function right (player) {
  var stone = ['arany', 'ezüst', 'gyémánt'];
  var way = readlineSync.keyInSelect(stone, 'találtál ásványokat melyiket választod');
  console.log(stone);
  if (way === 0) {
    gold(player);
  }
  if (way === 1) {
    silver(player);
  }
  if (way === 2) {
    diamond(player);
  }


}

function left (player) {
  var t = ['vissza megy'];
  var way = readlineSync.keyInSelect(t, 'zsákutca, menj vissza');
  console.log(t);
  if (way === 0) { start(player); }
}

function gold (player) {
  var a = ['nem foglalkozol vele', 'megnézed'];
  var way = readlineSync.keyInSelect(a, 'aranyat elraktad, zajt hallasz mit teszel?');
  item = 'arany';
  console.log(a);
  if (way === 0) { next(player); }
  if (way === 1) { death(player); }
}

function silver (player) {
  var a = ['nem foglalkozol vele', 'megnézed'];
  var way = readlineSync.keyInSelect(a, 'ezüstöt elraktad, zajt hallasz mit teszel?');
  item = 'ezüst';
  console.log(a);
  if (way === 0) { next(player); }
  if (way === 1) { death(player); }
}

function diamond (player) {
  var a = ['nem foglalkozol vele', 'megnézed'];
  var way = readlineSync.keyInSelect(a, 'gyémántot elraktad, zajt hallasz mit teszel?');
  item = 'gyémánt';
  console.log(a);
  if (way === 0) { next(player); }
  if (way === 1) { death(player); }
}

function next (player) {
  var a = ['kimész azonnal', 'vársz egy kicsit'];
  var way = readlineSync.keyInSelect(a, 'látod a kijáratot');
  console.log(a);
  if (way === 0) { death2(player); }
  if (way === 1) { win(player); }
}

function death (player) {
  var a = ['meghaltál, újrakezd'];
  var way = readlineSync.keyInSelect(a, 'sajnos meghaltál, mert egy óriás féreg megőlt');
  console.log(a);
  if (way === 0) { start(player); }
}

function death2 (player) {
  var a = ['meghaltál, újrakezd'];
  var way = readlineSync.keyInSelect(a, 'sajnos meghaltál, mert rádszakadt egy szikla');
  console.log(a);
  if (way === 0) { start(player); }
}


function win (player) {
  var a = ['nyertél, akarsz mégegyet, kilép'];
  var way = readlineSync.keyInSelect(a, 'gratulálok ' + player1 + ' nyertél. kijutottál. jutalmad egy ' + item);
  console.log(a);
  if (way === 0) { start(player); }
}

start(player1);