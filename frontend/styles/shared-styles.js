// eagerly import theme styles so as we can override them
import '@vaadin/vaadin-lumo-styles/all-imports';

const $_documentContainer = document.createElement('template');

$_documentContainer.innerHTML = `
<custom-style>
  <style>
    html {
      --lumo-base-color: #f2f2f2;
      --lumo-primary-color: hsl(0, 100%, 50%);
      --lumo-body-text-color: hsla(228, 100%, 50%, 0.94);
      --lumo-primary-text-color: hsl(359, 100%, 50%);
      --lumo-error-text-color: hsl(3, 100%, 50%);
      --lumo-error-color: hsl(0, 100%, 50%);
      --lumo-font-family: "Palatino Linotype", Palatino, Palladio, "URW Palladio L", "Book Antiqua", Baskerville, "Bookman Old Style", "Bitstream Charter", "Nimbus Roman No9 L", Garamond, "Apple Garamond", "ITC Garamond Narrow", "New Century Schoolbook", "Century Schoolbook", "Century Schoolbook L", Georgia, serif;
    }

    [theme~="dark"] {
      --lumo-primary-color: hsl(0, 71%, 94%);
      --lumo-base-color: hsl(214, 64%, 16%);
      --lumo-primary-text-color: hsl(359, 100%, 50%);
    }
  </style>
</custom-style>


<custom-style>
  <style>
    html {
      overflow:hidden;
    }
  </style>
</custom-style>

<dom-module id="app-layout" theme-for="vaadin-app-layout">
  <template>
    <style>
      :host(:not([dir='rtl']):not([overlay])) [part='drawer'] {
        border-right: none;
        box-shadow: var(--lumo-box-shadow-s);
        background-color: var(--lumo-base-color);
        z-index: 1;
      }
      :host([dir='rtl']:not([overlay])) [part='drawer'] {
        border-left: none;
        box-shadow: var(--lumo-box-shadow-s);
        background-color: var(--lumo-base-color);
        z-index: 1;
      }
      [part='navbar'] {
        box-shadow: var(--lumo-box-shadow-s);
      }
    </style>
  </template>
</dom-module>`;

document.head.appendChild($_documentContainer.content);
