import { Component } from '@angular/core';

interface Card {
  icon: string;
  turned: boolean;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Pexeso';

  savedCard: Card | null = null;
  begin = false;
  count: number;
  Cards = [];

  cards: Card[] = [
    {icon: 'malphite', turned: false},
    {icon: 'teemo', turned: false},
    {icon: 'udyr', turned: false},
    {icon: 'azir', turned: false},
    {icon: 'vayne', turned: false},
    {icon: 'caitlyn', turned: false},
  ];

  turn(clickedCard: Card): void {
    if (clickedCard.turned === true) {
      return;
    }
    if (this.savedCard === null) {
      clickedCard.turned = true;
      this.savedCard = clickedCard;
    } else {
      if (this.savedCard !== clickedCard) {
        clickedCard.turned = true;
        if (clickedCard.icon !== this.savedCard.icon) {
          const savedCard = this.savedCard;
          setTimeout(() => {
            clickedCard.turned = false;
            savedCard.turned = false;
          }, 1000);
        }

        this.savedCard = null;
      }
    }
  }

  cardDuplicate(): Card[]{
    this.cards.length = this.count;
    console.log(this.cards.length);
    console.log(" count1 " + this.count);
    for (let i = 0; i < this.count; i++){
      this.Cards[i] = this.cards[i];
      this.cards[this.cards.length] = {...this.Cards[i]};

    }
    return this.cards;
  }

  submit() : void{
    this.begin = true;
    if (this.begin){
      this.cardDuplicate();
      this.shuffle(this.cards);
    } else console.log("neco se pokazilo");
  }

  shuffle(cards) {
    var currentIndex = cards.length, temporaryValue, randomIndex;
    while (0 !== currentIndex) {
      randomIndex = Math.floor(Math.random() * currentIndex);
      currentIndex -= 1;
      temporaryValue = cards[currentIndex];
      cards[currentIndex] = cards[randomIndex];
      cards[randomIndex] = temporaryValue;
    }
    return cards;
  }
}
